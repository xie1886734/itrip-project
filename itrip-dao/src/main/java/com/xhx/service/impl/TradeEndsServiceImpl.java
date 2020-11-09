package com.xhx.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhx.mapper.TradeEndsMapper;
import com.xhx.entity.TradeEnds;
import com.xhx.service.TradeEndsService;
@Service
public class TradeEndsServiceImpl extends ServiceImpl<TradeEndsMapper, TradeEnds> implements TradeEndsService{

}
