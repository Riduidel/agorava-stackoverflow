
package org.agorava.stackexchange.model;

import java.util.List;

public class Infos{
   	private boolean has_more;
   	private List<Items> items;
   	private Number quota_max;
   	private Number quota_remaining;

 	public boolean getHas_more(){
		return this.has_more;
	}
	public void setHas_more(boolean has_more){
		this.has_more = has_more;
	}
 	public List<Items> getItems(){
		return this.items;
	}
	public void setItems(List<Items> items){
		this.items = items;
	}
 	public Number getQuota_max(){
		return this.quota_max;
	}
	public void setQuota_max(Number quota_max){
		this.quota_max = quota_max;
	}
 	public Number getQuota_remaining(){
		return this.quota_remaining;
	}
	public void setQuota_remaining(Number quota_remaining){
		this.quota_remaining = quota_remaining;
	}
}
