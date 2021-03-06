package com.katran.model;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;

/**
 * Created by Katran on 13.06.2015.
 */
@Entity
@Table(name = "WINNER")
public class Winner {
    @Id
    @Column(name = "WINNER_ID")
    @GeneratedValue
    private Integer winnerId;

    @Column(name = "STUDENT")
    private String student;

    @ManyToOne
    @JoinColumn(name = "INSTITUTE_ID")
    private Institute institute;

    @Column(name = "TEACHER")
    private String teacher;

    @ManyToOne
    @JoinColumn(name = "KAFEDRA_ID")
    private Kafedra kafedra;

    @ManyToOne
    @JoinColumn(name = "PROTOCOL_ID", insertable = false, updatable = false, nullable = false)
    private Protocol protocol;

    @Column(name = "SCORE")
    private Integer score;

    @Column(name = "POSITION")
    private Integer position;

    @Column(name = "POSITION_MONU")
    private Integer positionMONU;

    public Winner() {
    }

    public Winner(String student, Institute institute, String teacher, Kafedra kafedra) {
        this.student = student;
        this.institute = institute;
        this.teacher = teacher;
        this.kafedra = kafedra;
    }

    public Winner(String student, Institute institute, String teacher, Kafedra kafedra, Protocol protocol, Integer score, Integer position, Integer positionMONU) {
        this.student = student;
        this.institute = institute;
        this.teacher = teacher;
        this.kafedra = kafedra;
        this.protocol = protocol;
        this.score = score;
        this.position = position;
        this.positionMONU = positionMONU;
    }

    public Integer getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Integer winnerId) {
        this.winnerId = winnerId;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Kafedra getKafedra() {
        return kafedra;
    }

    public void setKafedra(Kafedra kafedra) {
        this.kafedra = kafedra;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getPositionMONU() {
        return positionMONU;
    }

    public void setPositionMONU(Integer positionMONU) {
        this.positionMONU = positionMONU;
    }

    @JsonIgnore
    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }


}
