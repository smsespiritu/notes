// Below is the code for the DepartmentServiceImpl.java file.
package com.example.notes.service;

import com.example.notes.entity.Note;
import com.example.notes.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    private NoteRepository noteRepository;

    // save operation
    @Override
    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    // read operation
    @Override
    public List<Note> fetchNoteList() {
        return (List<Note>) noteRepository.findAll();
    }

    // read operation by Id
    @Override
    public Optional<Note> fetchNoteById(Long id) {
        return noteRepository.findById(id);
    }

    // update operation
    @Override
    public Note updateNote(Note note, Long id) {
        Note noteDB = noteRepository.findById(id).get();

        if (Objects.nonNull(note.getTitle()) && !"".equalsIgnoreCase(note.getTitle())) {
            noteDB.setTitle(note.getTitle());
        }

        if (Objects.nonNull(note.getBody()) && !"".equalsIgnoreCase(note.getBody())) {
            noteDB.setBody(note.getBody());
        }

        return noteRepository.save(noteDB);
    }

    // delete operation
    @Override
    public void deleteNoteById(Long id) {
        noteRepository.deleteById(id);
    }

}
