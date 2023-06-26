package four.repository;

import four.common.ReadAndWrite;
import four.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepo {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static final String PATH_TEACHER = "src/four/data/teacher.csv";

    @Override
    public List<Teacher> getAll() {
        List<String> stringList = ReadAndWrite.readFile(PATH_TEACHER);
        teacherList.clear();
        String[] info;
        for (String str : stringList) {
            info = str.split(",");
            teacherList.add(new Teacher(info[0], info[1], Integer.parseInt(info[2]), info[3]));
        }
        return teacherList;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        List<String> stringList = new ArrayList<>();
        stringList.add(teacher.getId() + "," + teacher.getName() + "," + teacher.getAge() + "," + teacher.getLevel());
        ReadAndWrite.writeFile(stringList, PATH_TEACHER, true);
    }

    @Override
    public void deleteTeacher(Teacher teacher) {
        teacherList = getAll();
        teacherList.remove(teacher);
        List<String> stringList = new ArrayList<>();
        for (Teacher temp : teacherList) {
            stringList.add(temp.getId() + "," + temp.getName() + "," + temp.getAge() + "," + temp.getLevel());
        }
        ReadAndWrite.writeFile(stringList, PATH_TEACHER, false);
    }

    @Override
    public void searchTeacher(String name) {
        teacherList = getAll();
        for (Teacher str : teacherList) {
            if (str.getName().contains(name)) {
                System.out.println(str);
            }
        }
    }

    @Override
    public Teacher getById(String id) {
        teacherList = getAll();
        for (Teacher str : teacherList) {
            if (str.getId().equals(id)) {
                return str;
            }
        }
        return null;
    }
}
