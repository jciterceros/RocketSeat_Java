package br.com.jciterceros.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/*
 * ID: é um identificador único para cada tarefa
 * Usuarío: é o usuário que criou a tarefa
 * Descrição: é a descrição da tarefa
 * Título: é o título da tarefa
 * Data de Início: é a data de início da tarefa
 * Data de Término: é a data de término da tarefa
 * Prioridade: é a prioridade da tarefa
 * 
 */

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;

    @Column(length = 50)
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
