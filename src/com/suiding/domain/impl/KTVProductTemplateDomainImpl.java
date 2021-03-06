package com.suiding.domain.impl;

import java.util.List;
import java.util.UUID;

import com.suiding.domain.IKTVProductTemplateDomain;
import com.suiding.model.KTVProductTemplate;
import com.suiding.model.Page;
import com.suiding.service.ILeSouShopService;
import com.suiding.service.ServiceFactory;
import com.suiding.util.LeSouException;

public class KTVProductTemplateDomainImpl implements IKTVProductTemplateDomain {

	ILeSouShopService<KTVProductTemplate> service = ServiceFactory.getKTVProductTemplateDAO();
	
	public boolean Insert(KTVProductTemplate model) throws LeSouException{
		return service.Insert(model);
	}

	public boolean Update(KTVProductTemplate model) throws LeSouException{
		return service.Update(model);
	}

	public boolean Delete(KTVProductTemplate model) throws LeSouException{
		return service.Delete(model);
	}

	public KTVProductTemplate GetByID(UUID id) throws LeSouException{
		return service.GetByID(id);
	}
	
	public List<KTVProductTemplate> GetAll() throws LeSouException{
		return service.GetAll();
	}

	public boolean DeleteList(List<KTVProductTemplate> models) throws LeSouException{
		return service.DeleteList(models);
	}

	public boolean DeleteListByID(List<UUID> ids) throws LeSouException{
		return service.DeleteListByID(ids);
	}

	public boolean DeleteByID(UUID id) throws LeSouException{
		return service.DeleteByID(id);
	}

	public long GetRecordCount(String strWhere) throws LeSouException{
		return service.GetRecordCount(strWhere);
	}

	public boolean Exists(UUID id) throws LeSouException{
		return service.Exists(id);
	}

	public List<KTVProductTemplate> GetListByPage(String strWhere, Page page) throws LeSouException{
		return service.GetListByPage(strWhere, page);
	}

	public List<KTVProductTemplate> GetListWhere(String strWhere, String order,
			String asc) throws LeSouException {
		return service.GetListWhere(strWhere, order, asc);
	}

}