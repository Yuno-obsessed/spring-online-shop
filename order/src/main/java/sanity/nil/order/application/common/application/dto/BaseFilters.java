package sanity.nil.order.application.common.application.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BaseFilters {

    public Integer limit;
    public Integer offset;
    public Order order;

    public enum Order {
        ASC,
        DESC,
        ;

        public static Order fromString(String str) {
            Order order = DESC;
            if (str == null || str.equalsIgnoreCase("ASC")) {
                order = ASC;
            }
            return order;
        }
    };

    public BaseFilters(Integer limit, Integer offset, Order order) {
        this.limit = limit == null ? 10 : limit;
        this.offset = offset == null ? 0 : offset;
        this.order = order;
    }
}
