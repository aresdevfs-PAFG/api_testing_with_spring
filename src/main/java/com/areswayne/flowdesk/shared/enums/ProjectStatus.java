package com.areswayne.flowdesk.shared.enums;

/**
 * Estados de un proyecto dentro de un workspace.
 *
 * ACTIVE    → en curso, acepta tareas nuevas
 * ON_HOLD   → pausado temporalmente
 * COMPLETED → entregado y cerrado
 * ARCHIVED  → histórico, solo lectura
 */
public enum ProjectStatus {
    ACTIVE,
    ON_HOLD,
    COMPLETED,
    ARCHIVED
}