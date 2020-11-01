package ua.notky.notes.service;

import java.util.List;

import ua.notky.notes.model.Note;

public interface NoteService {
    Note save(Note note);
    void delete(int id);
    Note get(int id);
    Note update(Note note);
    List<Note> getAll();
    void saveAll(List<Note> list);
}