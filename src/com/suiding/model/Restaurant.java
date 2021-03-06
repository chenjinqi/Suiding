package com.suiding.model;

import java.util.UUID;

import com.suiding.util.UUIDUtil;

/***
 * 
 * ���ݡ�����
 * 
 */
public class Restaurant extends StoreBase {

	public UUID Sb_ID = UUIDUtil.Empty;
	public int Level;
	private UUID Rsr_ID = UUIDUtil.Empty;

	public Restaurant() {
		this.Rsr_ID = UUID.randomUUID();
		this.Sb_ID = super.getID();
	}

	public Restaurant(StoreBase storeBase, int TsrLevel) {
		super(storeBase);
		if (storeBase != null) {
			this.Sb_ID = storeBase.getID();
		}
		this.Level = TsrLevel;
		this.Rsr_ID = UUID.randomUUID();
	}

	public Restaurant(StoreBase storeBase) {
		super(storeBase);
		if (storeBase != null) {
			this.Sb_ID = storeBase.getID();
		}
		this.Rsr_ID = UUID.randomUUID();
	}

	public UUID getSb_ID() {
		return Sb_ID;
	}

	public void setSb_ID(UUID Sb_ID) {
		this.Sb_ID = Sb_ID;
	}

	public int getTsrLevel() {
		return Level;
	}

	public void setTsrLevel(int TsrLevel) {
		this.Level = TsrLevel;
	}

	public UUID getRsr_ID() {
		return Rsr_ID;
	}

	public void setRsr_ID(UUID ID) {
		this.Rsr_ID = ID;
	}

	/**
	 * ���ID�ֶκ�name�ֶ��Ƿ�Ϊ�ջ���Ϊ���� ͨ������true ���򷵻�false �����ֶμ�����Ϊ�� �޸�ΪĬ��ֵ
	 */
	public boolean checkModelIsPassed() {
		if (this.Sb_ID == null || this.Sb_ID == UUIDUtil.Empty || Rsr_ID == null
				|| this.Rsr_ID == UUIDUtil.Empty) {
			return false;
		}

		return true;
	}
}
