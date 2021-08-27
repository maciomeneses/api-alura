package src.main.java.br.com.alura.modelo;

import java.time.LocalDateTime;

@Builder
@Getter @Setter
public class CourseApproval {


     private Long id;
     private Long courseId;
     private String approvedBy;
     private LocalDateTime createdAt;
     private LocalDateTime updatedAt;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CourseApproval other = (CourseApproval) obj;
        if (id == null) {
            if (other.getId() != null)
                return false;
        } else if (!id.equals(other.getId()))
            return false;
        return true;
    }

}
