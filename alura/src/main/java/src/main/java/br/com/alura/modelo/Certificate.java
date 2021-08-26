package src.main.java.br.com.alura.modelo;

import java.time.LocalDateTime;

public class Certificate {

    private long id;
    private long course_id;
    private long user_id;
    private LocalDateTime issued_at;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public Certificate(int id, int course_id, int user_id, LocalDateTime issued_at, LocalDateTime created_at, LocalDateTime updated_at) {
        this.id = id;
        this.course_id = course_id;
        this.user_id = user_id;
        this.issued_at = issued_at;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Certificate other = (Certificate) obj;
        if (Long.valueOf(id) == null) {
            if (Long.valueOf(other.getId()) != null)
                return false;
        } else if (id != (other.getId()))
            return false;
        return true;
    }

    public long getId() {
        return id;
    }

    public long getCourse_id() {
        return course_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public LocalDateTime getIssued_at() {
        return issued_at;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setIssued_at(LocalDateTime issued_at) {
        this.issued_at = issued_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}