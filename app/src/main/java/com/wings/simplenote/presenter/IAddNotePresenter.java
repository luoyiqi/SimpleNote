package com.wings.simplenote.presenter;

import com.wings.simplenote.model.domain.Note;

/**
 * Created by wing on 2016/4/29.
 * The presenter to add note to model.
 */
public interface IAddNotePresenter {
    void saveNote(Note note);
}
