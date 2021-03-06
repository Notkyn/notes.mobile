package ua.notky.notes.dao.room;

import java.util.List;

import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import ua.notky.notes.model.Note;

@Dao
public interface NoteDao {

    @Insert
    long save(Note note);

    @Update
    void update(Note note);

    @Delete
    int delete(Note note);

    @Query(value = "SELECT * FROM note")
    List<Note> getAll();

    @Query(value = "SELECT * FROM note WHERE id = :id")
    Note get(int id);

    @Query("SELECT * FROM note ORDER BY note.date DESC")
    DataSource.Factory<Integer, Note> getFactoryNotes();
}
