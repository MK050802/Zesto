package in.adityachaple.foodiesapi.io;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OrderRequest {
    private List<OrderItem> orderedItems;
    private String userAddress;
    private double amount;
    private String email;
    private String phoneNumber;
    private String orderStatus;
    public void setAmount(Object amount) {
        if (amount instanceof Integer) {
            this.amount = ((Integer) amount).doubleValue();
        } else if (amount instanceof Double) {
            this.amount = (Double) amount;
        } else if (amount instanceof String) {
            this.amount = Double.valueOf((String) amount);
        } else {
            throw new IllegalArgumentException("Invalid amount type: " + amount.getClass());
        }
    }
}
