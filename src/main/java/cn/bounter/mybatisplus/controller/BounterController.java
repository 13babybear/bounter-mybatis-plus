package cn.bounter.mybatisplus.controller;


import cn.bounter.mybatisplus.common.PageReq;
import cn.bounter.mybatisplus.entity.Bounter;
import cn.bounter.mybatisplus.service.IBounterService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author simon
 * @since 2019-05-09
 */
@RestController
@RequestMapping("/api/bounter")
public class BounterController {

    @Autowired
    private IBounterService bounterService;


    /**
     * 列表&搜索
     * @param pageReq
     * @return
     */
    @PostMapping("/list")
    public R<?> list(@RequestBody PageReq<Bounter> pageReq) {
        Bounter bounter = pageReq.getReqObj() == null ? new Bounter() : pageReq.getReqObj();
        return R.ok(bounterService.page(new Page<>(pageReq.getPageNum(), pageReq.getPageSize()),
                Wrappers.<Bounter>lambdaQuery().eq(Bounter::getId, bounter.getId())));
    }


    /**
     * 详情
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public R<?> detail(@PathVariable Long id) {
        return R.ok(bounterService.getById(id));
    }


    /**
     * 新增
     * @param bounter
     * @return
     */
    @PostMapping
    public R<?> save(@RequestBody Bounter bounter) {
        return R.ok(bounterService.save(bounter));
    }


    /**
     * 修改
     * @param bounter
     * @return
     */
    @PutMapping
    public R<?> update(@RequestBody Bounter bounter){
        return R.ok(bounterService.updateById(bounter));
    }


    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public R<?> delete(@PathVariable Long id) {
        return R.ok(bounterService.removeById(id));
    }
}
