package br.com.thiagojose.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

public class TaskModel {
    /*
     * 
     * ID
     * Usuário(ID_USUARIO)
     * Descrição
     * Título
     * Data de Início
     * Data de Término
     * Prioridade
     * 
     */

     private UUID id;
     private String description;
     private String title;
     private LocalDateTime startAt;
     private LocalDateTime endAt;
}