package com.rc.dl.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 订单实体类
 * @author cat
 *
 */
@Entity
@Table(name = "T_ORDER")
public class Order 
{
	/**
	 * 订单ID
	 */
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	/**
	 * 发布者的ID
	 */
	@Column(name = "boss_id")
	private String bossId;
	
	/**
	 * 游戏/区/服
	 */
	@Column(name = "game_location_info")
	private String gameLocationInfo;
	
	/**
	 * 订单标题
	 */
	@Column(name = "game_title")
	private String gameTitle;
	
	/**
	 * 角色名字
	 */
	@Column(name = "game_role_name")
	private String gameRoleName;
	
	/**
	 * 订单状态
	 */
	@Column(name = "order_status")
	private String orderStatus;
	
	/**
	 * 订单价格
	 */
	@Column(name = "order_price")
	private String orderPrice;
	
	/**
	 * 订单安全保证金
	 */
	@Column(name = "order_safe_price")
	private String orderSafePrice;
	
	/**
	 * 效率保证金
	 */
	@Column(name = "order_efficiency_price")
	private String orderEfficiencyPrice;
	
	
	/**
	 * 订单发布时间(yyyy mm dd)
	 */
	@Column(name = "creat_time")
	private Date creatTime ;
	
	/**
	 *接单时间 即开始时间startTime
	 */
	@Column(name = "start_time")
	private Date startTime;
	
	/**
	 *订单结束时间endTime	
	 */
	@Column(name = "end_time")
	private Date endTime;
	
	/**
	 * 频道类型（公共和私人）
	 */
	@Column(name = "order_send_status")
	private String orderSendStatus;
	
	
	/**
	 * 转发布  二手单  如我接了一个単  在发布给别人
	 */
	@Column(name = "is_second_send")
	private String isSecondSend ;
	
	/**
	 *订单总时间	
	 */
	@Transient
	private String totleTime;
	
	/**
	 *剩余时间	leftTime
	 */
	@Transient
	private String leftTime;
	
	
	
	public String getIsSecondSend() {
		return isSecondSend;
	}

	public void setIsSecondSend(String isSecondSend) {
		this.isSecondSend = isSecondSend;
	}



	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getTotleTime() {
		return totleTime;
	}

	public void setTotleTime(String totleTime) {
		this.totleTime = totleTime;
	}

	public String getOrderSendStatus() {
		return orderSendStatus;
	}

	public void setOrderSendStatus(String orderSendStatus) {
		this.orderSendStatus = orderSendStatus;
	}

	
	public String getLeftTime() {
		return leftTime;
	}

	public void setLeftTime(String leftTime) {
		this.leftTime = leftTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBossId() {
		return bossId;
	}

	public void setBossId(String bossId) {
		this.bossId = bossId;
	}

	public String getGameLocationInfo() {
		return gameLocationInfo;
	}

	public void setGameLocationInfo(String gameLocationInfo) {
		this.gameLocationInfo = gameLocationInfo;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public String getGameRoleName() {
		return gameRoleName;
	}

	public void setGameRoleName(String gameRoleName) {
		this.gameRoleName = gameRoleName;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderSafePrice() {
		return orderSafePrice;
	}

	public void setOrderSafePrice(String orderSafePrice) {
		this.orderSafePrice = orderSafePrice;
	}

	public String getOrderEfficiencyPrice() {
		return orderEfficiencyPrice;
	}

	public void setOrderEfficiencyPrice(String orderEfficiencyPrice) {
		this.orderEfficiencyPrice = orderEfficiencyPrice;
	}
	
}
