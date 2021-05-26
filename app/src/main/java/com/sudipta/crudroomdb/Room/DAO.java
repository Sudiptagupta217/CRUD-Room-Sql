package com.sudipta.crudroomdb.Room;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface DAO {       //DATA ACCESS OBJECT

    @Insert
    public void studentInsertion(Student student);

    @Query("Select * from Student")
    List<Student> getStudent();

    @Query("Update Student set stuFirstName=:stuName  where stuId = :stuID ")
    void updatedtu(String stuName, int stuID);
}
