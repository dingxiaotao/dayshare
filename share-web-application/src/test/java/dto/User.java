package dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author dingxiaotao
 * @date 2020/5/28
 */
@Data
@Builder
public class User {
    private String name;
    private Integer age;
}
