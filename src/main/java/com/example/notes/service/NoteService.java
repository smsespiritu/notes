package com.example.notes.service;

import com.example.notes.entity.Note;
import java.util.List;
import java.util.Optional;

public interface NoteService {
    // save operation
    Note saveNote(Note note);

    // read operation
    List<Note> fetchNoteList();

    // read operation by Id
    Optional<Note> fetchNoteById(Long id);

    // update operation
    Note updateNote(Note note, Long id);

    // delete operation
    void deleteNoteById(Long id);
}

