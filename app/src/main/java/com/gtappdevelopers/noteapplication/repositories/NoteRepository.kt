package com.gtappdevelopers.noteapplication.repositories

import androidx.lifecycle.LiveData
import com.gtappdevelopers.noteapplication.dao.NotesDao
import com.gtappdevelopers.noteapplication.entities.Note

class NoteRepository(private val notesDao: NotesDao) {


    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()

    suspend fun insert(note: Note) {
        notesDao.insert(note)
    }
    suspend fun delete(note: Note){
        notesDao.delete(note)
    }

    suspend fun update(note: Note){
        notesDao.update(note)
    }
}