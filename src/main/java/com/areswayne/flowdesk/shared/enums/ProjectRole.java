package com.areswayne.flowdesk.shared.enums;

/**
 * Rol de un usuario dentro de un proyecto específico.
 * Independiente del Role global — un MEMBER global puede ser MANAGER en un proyecto.
 *
 * MANAGER      → puede editar el proyecto, invitar miembros, generar facturas
 * COLLABORATOR → puede crear y editar tareas, registrar tiempo
 * VIEWER       → solo lectura, útil para clientes o stakeholders
 */
public enum ProjectRole {
    MANAGER,
    COLLABORATOR,
    VIEWER
}
