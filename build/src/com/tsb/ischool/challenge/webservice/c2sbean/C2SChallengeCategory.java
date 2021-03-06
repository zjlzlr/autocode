/**
 * 版权所有：版权所有(C) 2016，学酷网络 
 * 文件名称: C2SChallengeCategory.java 
 * 设计作者: 
 * 完成日期: 
 * 内容摘要:
 *
 * 修改记录: 
 * 修改日期:
 * 修 改 人:
 * 修改内容:
 */
package com.tsb.ischool.challenge.webservice.c2sbean;

import java.io.Serializable;
import com.tsb.ischool.framework.common.ErrorCode;
import com.tsb.ischool.framework.exception.ISchoolException;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
* 类 名 称：C2SChallengeCategory
* 内容摘要：
* 完成日期：
* 编码作者：
*/
public class C2SChallengeCategory implements Serializable 
{

    /** 
     *PRIMARY KEY,对应表[T_CHALLENGE_CATEGORY]的主键categoryid
     */
    private String categoryid;//主键

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段vtype
     */
	private Integer vtype;//分类类型（1个人项目；2团体项目）

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段title
     */
	private String title;//名称

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段vcode
     */
	private String vcode;//code码

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段subcount
     */
	private Integer subcount;//下级个数

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段parentid
     */
	private String parentid;//上级id

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段ordernum
     */
	private Integer ordernum;//排序号

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段isused
     */
	private Integer isused;//状态（0=不可用；1=可用）

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段createid
     */
	private String createid;//创建人

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段createtime
     */
	private String createtime;//创建时间

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段updatorid
     */
	private String updatorid;//修改人id

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段updatortime
     */
	private String updatortime;//修改时间

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段optip
     */
	private String optip;//操作ip

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段ext1
     */
	private String ext1;//扩展字段1

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段ext2
     */
	private String ext2;//扩展字段2

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段ext3
     */
	private String ext3;//扩展字段3

    /** 
     *对应表[T_CHALLENGE_CATEGORY]的字段business
     */
	private Integer business;//业务类型（1=爱挑战；2=才艺秀）

    private int curpage;//当前页码
	private int pagesize;//每页个数
	
	public boolean verify() throws ISchoolException {
		if (null == this) {
			throw new ISchoolException(ErrorCode.ISCHOOL_REQBODY_INVALID_MSGTYPE, "参数错误，入参为空。");
		}
		return true;
	}
	
	public int getCurpage() {
		return curpage;
	}

	public void setCurpage(int curpage) {
		this.curpage = curpage;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}





  
    
  /**
	*
	* @return String
	*/
	public String getCategoryid() 
	{
		return this.categoryid;
	}
	
  /**
	* Set the categoryid
	*/	
	public void setCategoryid(String aValue) 
	{
		this.categoryid = aValue;
	}	
  /**
	*
	* @return Integer
	*/
	public Integer getVtype() 
	{
		return this.vtype;
	}
	
  /**
	* Set the vtype
	*/	
	public void setVtype(Integer aValue) 
	{
		this.vtype = aValue;
	}	
  /**
	*
	* @return String
	*/
	public String getTitle() 
	{
		return this.title;
	}
	
  /**
	* Set the title
	*/	
	public void setTitle(String aValue) 
	{
		this.title = aValue;
	}	
  /**
	*
	* @return String
	*/
	public String getVcode() 
	{
		return this.vcode;
	}
	
  /**
	* Set the vcode
	*/	
	public void setVcode(String aValue) 
	{
		this.vcode = aValue;
	}	
  /**
	*
	* @return Integer
	*/
	public Integer getSubcount() 
	{
		return this.subcount;
	}
	
  /**
	* Set the subcount
	*/	
	public void setSubcount(Integer aValue) 
	{
		this.subcount = aValue;
	}	
  /**
	*
	* @return String
	*/
	public String getParentid() 
	{
		return this.parentid;
	}
	
  /**
	* Set the parentid
	*/	
	public void setParentid(String aValue) 
	{
		this.parentid = aValue;
	}	
  /**
	*
	* @return Integer
	*/
	public Integer getOrdernum() 
	{
		return this.ordernum;
	}
	
  /**
	* Set the ordernum
	*/	
	public void setOrdernum(Integer aValue) 
	{
		this.ordernum = aValue;
	}	
  /**
	*
	* @return Integer
	*/
	public Integer getIsused() 
	{
		return this.isused;
	}
	
  /**
	* Set the isused
	*/	
	public void setIsused(Integer aValue) 
	{
		this.isused = aValue;
	}	
  /**
	*
	* @return String
	*/
	public String getCreateid() 
	{
		return this.createid;
	}
	
  /**
	* Set the createid
	*/	
	public void setCreateid(String aValue) 
	{
		this.createid = aValue;
	}	
  /**
	*
	* @return String
	*/
	public String getCreatetime() 
	{
		return this.createtime;
	}
	
  /**
	* Set the createtime
	*/	
	public void setCreatetime(String aValue) 
	{
		this.createtime = aValue;
	}	
  /**
	*
	* @return String
	*/
	public String getUpdatorid() 
	{
		return this.updatorid;
	}
	
  /**
	* Set the updatorid
	*/	
	public void setUpdatorid(String aValue) 
	{
		this.updatorid = aValue;
	}	
  /**
	*
	* @return String
	*/
	public String getUpdatortime() 
	{
		return this.updatortime;
	}
	
  /**
	* Set the updatortime
	*/	
	public void setUpdatortime(String aValue) 
	{
		this.updatortime = aValue;
	}	
  /**
	*
	* @return String
	*/
	public String getOptip() 
	{
		return this.optip;
	}
	
  /**
	* Set the optip
	*/	
	public void setOptip(String aValue) 
	{
		this.optip = aValue;
	}	
  /**
	*
	* @return String
	*/
	public String getExt1() 
	{
		return this.ext1;
	}
	
  /**
	* Set the ext1
	*/	
	public void setExt1(String aValue) 
	{
		this.ext1 = aValue;
	}	
  /**
	*
	* @return String
	*/
	public String getExt2() 
	{
		return this.ext2;
	}
	
  /**
	* Set the ext2
	*/	
	public void setExt2(String aValue) 
	{
		this.ext2 = aValue;
	}	
  /**
	*
	* @return String
	*/
	public String getExt3() 
	{
		return this.ext3;
	}
	
  /**
	* Set the ext3
	*/	
	public void setExt3(String aValue) 
	{
		this.ext3 = aValue;
	}	
  /**
	*
	* @return Integer
	*/
	public Integer getBusiness() 
	{
		return this.business;
	}
	
  /**
	* Set the business
	*/	
	public void setBusiness(Integer aValue) 
	{
		this.business = aValue;
	}	
  
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		return new ToStringBuilder(this)
				.append("categoryid", this.categoryid) 
				.append("vtype", this.vtype) 
				.append("title", this.title) 
				.append("vcode", this.vcode) 
				.append("subcount", this.subcount) 
				.append("parentid", this.parentid) 
				.append("ordernum", this.ordernum) 
				.append("isused", this.isused) 
				.append("createid", this.createid) 
				.append("createtime", this.createtime) 
				.append("updatorid", this.updatorid) 
				.append("updatortime", this.updatortime) 
				.append("optip", this.optip) 
				.append("ext1", this.ext1) 
				.append("ext2", this.ext2) 
				.append("ext3", this.ext3) 
				.append("business", this.business) 
				.append("curpage", this.curpage).append("pagesize", this.pagesize) 
		.toString();
	}

   /**
	 * Return the name of the first key column
	 */
	public String getFirstKeyColumnName() 
	{
		return "categoryid";
	}
	
}