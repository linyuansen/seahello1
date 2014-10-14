 <%@ page pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s" %>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
 <div class="m_rigth_all">
 <div class="m_right   item1">
                <div class="order_top">
                    <div  class="t_btn_box">
                        <div  class="t_btns">
                            <input type="button"  value="发单说明"  id="receipt"/>
                            <input type="button"  value="代练订单管理"  id="Leveling"/>
                        </div>
                    </div>
                    <div class="search1">
                        <form action=""  method="post" id="form1"   class="formed">
                            <label for=""><input type="checkbox" value="1" name=""  id="">所有订单</label>
                            <label for=""><input type="checkbox" value="1" name=""  id="">未接手的</label>
                            <label for=""><input type="checkbox" value="1" name=""  id="">正在代练</label>
                            <label for=""><input type="checkbox" value="1" name=""  id="">订单异常</label>
                            <label for=""><input type="checkbox" value="1" name=""  id="">帐号锁定</label>
                            <label for=""><input type="checkbox" value="1" name=""  id="">订单撒消</label>
                            <label for=""><input type="checkbox" value="1" name=""  id="">已结算的</label>
                            <input type="button"  value="搜索" id="rmulti_select">
                        </form>
                        <hr>
                        <form action=""  method="post" id="form2"  class="formed">
                            <label for=""><input type="radio" value="1" name="yy"  id="">发布时间</label>
                            <label for=""><input type="radio" value="2" name="yy"  id="">开始时间</label>
                            <label for=""><input type="radio" value="3" name="yy"  id="">结束时间</label>
                            <input type="text" id="inputDate1" value="开始时间" readonly="readonly" class="dates"/> —— 
                            <input type="text" id="inputDate2" value="结束时间" readonly="readonly"  class="dates"/>
                            <input type="button"  value="查找员工"  id="ser_staff" >
                            <input type="button"  value="我的员工"  id="my_employees">
                            <a href="#">发单手册</a>
                        </form>
                        <hr>
                        <form action=""  method="post" id="form3"  class="formed">
                            <span> 代练金额 </span>
                            <input type="text"  value=""  id="moneysta" >--
                            <input type="text"  value=""  id="moneyend" >
                            <input type="text"  value=""  id="sermoney" >
                            <input type="button"  value="搜索"  id="serm">
                        </form>
                    </div>
                    <div  class="re_publish">
                        <div id="re_publish_order">
                            <img src="images/order-2.png">
                            <span><a href="#">发布订单</a></span>
                        </div>
                    </div>
                </div>
                <div class="re_content">
                    <table class="tabled"  cellspacing="0" cellpadding="0" >
                        <thead>
                            <tr>
                                <td width="40px">序号</td>
                                <td width="100px">订单号</td>
                                <td width="50px">转发布</td>
                                <td width="40px">公共</td>
                                <td width="120px">游戏/区/服</td>
                                <td width="200px">标题</td>
                                <td width="70px">角色名</td>
                                <td width="40px">状态</td>
                                <td width="60px">价格(元)</td>
                                <td width="80px">安全保证金(元)</td>
                                <td width="100px">效率保证金(元)</td>
                            </tr>
                        </thead>
                        <s:iterator value="orders">
                        <tbody>
                            <tr>
								<td width="40px">1</td>
                                <td width="100px"><s:property value="id"/></td>
                                <td width="50px">1</td>
                                <td width="40px">1</td>
                                <td width="120px"><s:property value="gameLocationInfo"/></td>
                                <td width="200px"><s:property value="gameTitle"/></td>
                                <td width="70px"><s:property value="gameRoleName"/></td>
                                <td width="40px"><s:property value="orderStatus"/></td>
                                <td width="60px"><s:property value="orderPrice"/></td>
                                <td width="80px"><s:property value="orderSafePrice"/></td>
                                <td width="100px"><s:property value="orderEfficiencyPrice"/></td>
                             
                            </tr>
                        </tbody>
                         </s:iterator>
                        <tfoot>
                            <tr>
                                <td width="40px">1</td>
                                <td width="100px">2</td>
                                <td width="50px">3</td>
                                <td width="40px">4</td>
                                <td width="120px">5</td>
                                <td width="200px">6</td>
                                <td width="70px">7</td>
                                <td width="40px">8</td>
                                <td width="60px">9</td>
                                <td width="80px">9</td>
                                <td width="100px">9</td>
                            </tr>
                        </tfoot>
                    </table>
                </div>
                <div class="footer_order">
                    <span id="usered">用户:</span>
                    <span id="logined">已登陆:</span>
                    <span id="available_money">帐号可用资金:</span>
                    <span id="disabled_money">帐号冻结资金:</span>
                    <span id="ser_result">查询结果：</span>
                    <div class="tips">
                        <ul>
                            <li><span id="sp_1"></span><p>该订单有新的留言信息，请尽快查看</p></li>
                            <li><span id="sp_2"></span><p>该订单进入客服介入阶段，</p></li>
                            <li><span id="sp_3"></span><p>该订单进入客服介入阶段</p></li>
                            <li><span id="sp_4"></span><p>该订单进入客服介入阶段</p></li>
                        </ul>
                    </div>          
                </div>	
    	    </div>
</div>