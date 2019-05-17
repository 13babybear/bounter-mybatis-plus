package cn.bounter.mybatisplus.service.impl;

import cn.bounter.mybatisplus.entity.Bounter;
import cn.bounter.mybatisplus.dao.BounterMapper;
import cn.bounter.mybatisplus.service.IBounterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author simon
 * @since 2019-05-09
 */
@Service
public class BounterServiceImpl extends ServiceImpl<BounterMapper, Bounter> implements IBounterService {

}
