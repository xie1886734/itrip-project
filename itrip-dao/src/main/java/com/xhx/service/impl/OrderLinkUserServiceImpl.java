package com.xhx.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhx.entity.OrderLinkUser;
import com.xhx.mapper.OrderLinkUserMapper;
import com.xhx.service.OrderLinkUserService;
@Service
public class OrderLinkUserServiceImpl extends ServiceImpl<OrderLinkUserMapper, OrderLinkUser> implements OrderLinkUserService{

}
