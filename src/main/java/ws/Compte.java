package ws;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//java Bean
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compte {
    private int code;
    private double solde;
    private Date dateCreation;

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
