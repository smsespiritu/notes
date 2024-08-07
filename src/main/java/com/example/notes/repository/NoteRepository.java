// Importing package module to this code
package com.example.notes.repository;
// Importing required classes
import com.example.notes.entity.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Class
public interface NoteRepository
        extends CrudRepository<Note, Long> {
}
