package com.example.android.architecture.blueprints.todoapp.taskdetail;

import android.support.annotation.Nullable;

import com.example.android.architecture.blueprints.todoapp.data.Task;
import com.example.android.architecture.blueprints.todoapp.mvibase.MviViewState;
import com.example.android.architecture.blueprints.todoapp.tasks.AutoValue_TasksViewState;
import com.example.android.architecture.blueprints.todoapp.tasks.TasksFilterType;
import com.google.auto.value.AutoValue;

import java.util.Collections;
import java.util.List;

import static com.example.android.architecture.blueprints.todoapp.tasks.TasksFilterType.ALL_TASKS;

@AutoValue
abstract class TaskDetailViewState implements MviViewState {

    abstract String title();

    abstract String description();

    @Nullable
    abstract Throwable error();

    public abstract boolean taskComplete();

    public abstract boolean taskActivated();

    public abstract boolean taskDeleted();

    public abstract Builder buildWith();

    static TaskDetailViewState idle() {
        return new AutoValue_TaskDetailViewState.Builder()
                .title("")
                .description("")
                .error(null)
                .taskComplete(false)
                .taskActivated(false)
                .taskDeleted(false)
                .build();
    }

    @AutoValue.Builder
    static abstract class Builder {
        abstract Builder title(String title);

        abstract Builder description(String description);

        abstract Builder error(@Nullable Throwable error);

        abstract Builder taskComplete(boolean taskComplete);

        abstract Builder taskActivated(boolean taskActivated);

        abstract Builder taskDeleted(boolean taskDeleted);

        abstract TaskDetailViewState build();
    }
}
