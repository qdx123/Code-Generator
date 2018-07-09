package com.zlinks.com.zlinks.domain;

import com.hpxs.base.BaseEntity;
import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 实体bean
 * <p>
 * 表名：ord_refund
 * <p>
 * 描述：
 */
public class OrdRefund extends BaseEntity implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private BigInteger id;
	/**
	 * 创建时间
	 */
	private Date createdTime;
	/**
	 * 是否逻辑删除 (是:YES,否:NO)
	 */
	private String deleteFlag;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 
	 */
	private BigInteger version;
	/**
	 * 玩家账号
	 */
	private String account;
	/**
	 * 广告id
	 */
	private String adId;
	/**
	 * 支付渠道类型
	 */
	private BigInteger channelId;
	/**
	 * 渠道订单号
	 */
	private String channelOrderNum;
	/**
	 * 游戏订单号
	 */
	private String cpOrderNum;
	/**
	 * 游戏唯一id
	 */
	private BigInteger gameId;
	/**
	 * 游戏packageId
	 */
	private BigInteger gamePackageId;
	/**
	 * 游戏package
	 */
	private String gamePackageName;
	/**
	 * 订单唯一标示
	 */
	private String orderNum;
	/**
	 * 充值token
	 */
	private String payToken;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * 外部产品id
	 */
	private String productId;
	/**
	 * 产品类型
	 */
	private String productType;
	/**
	 * 购买时间
	 */
	private String purchaseTime;
	/**
	 * 角色id
	 */
	private String roleId;
	/**
	 * 玩家角色名称
	 */
	private String roleName;
	/**
	 * 区服id
	 */
	private String serverId;
	/**
	 * 用户id
	 */
	private BigInteger userId;
	/**
	 * 用户uid
	 */
	private String usrUid;
	/**
	 * 退款时间
	 */
	private String voidedTime;

	/**
	 * 获取
	 */
	public BigInteger getId() {
		return this.id;
	}

	/**
	 * 设置
	 */
	public void setId(BigInteger id) {
		this.id = id;
	}

	/**
	 * 获取创建时间
	 */
	public Date getCreatedTime() {
		return this.createdTime;
	}

	/**
	 * 设置创建时间
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * 获取是否逻辑删除 (是:YES,否:NO)
	 */
	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	/**
	 * 设置是否逻辑删除 (是:YES,否:NO)
	 */
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * 获取修改时间
	 */
	public Date getUpdateTime() {
		return this.updateTime;
	}

	/**
	 * 设置修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取
	 */
	public BigInteger getVersion() {
		return this.version;
	}

	/**
	 * 设置
	 */
	public void setVersion(BigInteger version) {
		this.version = version;
	}

	/**
	 * 获取玩家账号
	 */
	public String getAccount() {
		return this.account;
	}

	/**
	 * 设置玩家账号
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * 获取广告id
	 */
	public String getAdId() {
		return this.adId;
	}

	/**
	 * 设置广告id
	 */
	public void setAdId(String adId) {
		this.adId = adId;
	}

	/**
	 * 获取支付渠道类型
	 */
	public BigInteger getChannelId() {
		return this.channelId;
	}

	/**
	 * 设置支付渠道类型
	 */
	public void setChannelId(BigInteger channelId) {
		this.channelId = channelId;
	}

	/**
	 * 获取渠道订单号
	 */
	public String getChannelOrderNum() {
		return this.channelOrderNum;
	}

	/**
	 * 设置渠道订单号
	 */
	public void setChannelOrderNum(String channelOrderNum) {
		this.channelOrderNum = channelOrderNum;
	}

	/**
	 * 获取游戏订单号
	 */
	public String getCpOrderNum() {
		return this.cpOrderNum;
	}

	/**
	 * 设置游戏订单号
	 */
	public void setCpOrderNum(String cpOrderNum) {
		this.cpOrderNum = cpOrderNum;
	}

	/**
	 * 获取游戏唯一id
	 */
	public BigInteger getGameId() {
		return this.gameId;
	}

	/**
	 * 设置游戏唯一id
	 */
	public void setGameId(BigInteger gameId) {
		this.gameId = gameId;
	}

	/**
	 * 获取游戏packageId
	 */
	public BigInteger getGamePackageId() {
		return this.gamePackageId;
	}

	/**
	 * 设置游戏packageId
	 */
	public void setGamePackageId(BigInteger gamePackageId) {
		this.gamePackageId = gamePackageId;
	}

	/**
	 * 获取游戏package
	 */
	public String getGamePackageName() {
		return this.gamePackageName;
	}

	/**
	 * 设置游戏package
	 */
	public void setGamePackageName(String gamePackageName) {
		this.gamePackageName = gamePackageName;
	}

	/**
	 * 获取订单唯一标示
	 */
	public String getOrderNum() {
		return this.orderNum;
	}

	/**
	 * 设置订单唯一标示
	 */
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	/**
	 * 获取充值token
	 */
	public String getPayToken() {
		return this.payToken;
	}

	/**
	 * 设置充值token
	 */
	public void setPayToken(String payToken) {
		this.payToken = payToken;
	}

	/**
	 * 获取价格
	 */
	public BigDecimal getPrice() {
		return this.price;
	}

	/**
	 * 设置价格
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 获取外部产品id
	 */
	public String getProductId() {
		return this.productId;
	}

	/**
	 * 设置外部产品id
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * 获取产品类型
	 */
	public String getProductType() {
		return this.productType;
	}

	/**
	 * 设置产品类型
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * 获取购买时间
	 */
	public String getPurchaseTime() {
		return this.purchaseTime;
	}

	/**
	 * 设置购买时间
	 */
	public void setPurchaseTime(String purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

	/**
	 * 获取角色id
	 */
	public String getRoleId() {
		return this.roleId;
	}

	/**
	 * 设置角色id
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * 获取玩家角色名称
	 */
	public String getRoleName() {
		return this.roleName;
	}

	/**
	 * 设置玩家角色名称
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * 获取区服id
	 */
	public String getServerId() {
		return this.serverId;
	}

	/**
	 * 设置区服id
	 */
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	/**
	 * 获取用户id
	 */
	public BigInteger getUserId() {
		return this.userId;
	}

	/**
	 * 设置用户id
	 */
	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	/**
	 * 获取用户uid
	 */
	public String getUsrUid() {
		return this.usrUid;
	}

	/**
	 * 设置用户uid
	 */
	public void setUsrUid(String usrUid) {
		this.usrUid = usrUid;
	}

	/**
	 * 获取退款时间
	 */
	public String getVoidedTime() {
		return this.voidedTime;
	}

	/**
	 * 设置退款时间
	 */
	public void setVoidedTime(String voidedTime) {
		this.voidedTime = voidedTime;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
