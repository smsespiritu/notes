// Importing package module
package com.example.notes.controller;
// Importing required classes
import com.example.notes.entity.Note;
import com.example.notes.service.NoteService;
import java.util.List;
import java.util.Optional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController

// Class
public class NoteController {

    // Annotation
    @Autowired private NoteService noteService;

    // Save operation
    @PostMapping("/notes")
    public Note saveNote(
            @Valid @RequestBody Note note)
    {
        return noteService.saveNote(note);
    }

    // Read operation
    @GetMapping("/notes")
    public List<Note> fetchNoteList()
    {
        return noteService.fetchNoteList();
    }

    // Retrieve operation by id
    @GetMapping("/notes/{id}")
    public Optional<Note>
    findNoteById(@RequestBody Note note,
               @PathVariable("id") Long id)
    {
        return noteService.fetchNoteById(id);
    }

    // Update operation
    @PutMapping("/notes/{id}")
    public Note
    updateNote(@RequestBody Note note,
                     @PathVariable("id") Long id)
    {
        return noteService.updateNote(
                note, id);
    }

    // Delete operation
    @DeleteMapping("/notes/{id}")
    public String deleteNoteById(@PathVariable("id")
                                       Long id)
    {

        noteService.deleteNoteById(
                id);
        return "Deleted Successfully";
    }
}

