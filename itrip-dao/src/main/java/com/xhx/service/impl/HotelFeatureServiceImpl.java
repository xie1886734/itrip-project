package com.xhx.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhx.entity.HotelFeature;
import com.xhx.mapper.HotelFeatureMapper;
import com.xhx.service.HotelFeatureService;
@Service
public class HotelFeatureServiceImpl extends ServiceImpl<HotelFeatureMapper, HotelFeature> implements HotelFeatureService{

}
