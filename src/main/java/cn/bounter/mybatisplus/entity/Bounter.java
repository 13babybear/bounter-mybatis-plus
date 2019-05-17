package cn.bounter.mybatisplus.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author simon
 * @since 2019-05-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Bounter extends Model<Bounter> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String value;

    private Long createBy;

    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
