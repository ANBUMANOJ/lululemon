package com.lululemon.singleton;

import com.lululemon.objects.CreateAccountPom;
import com.lululemon.objects.ForgetPasswordPom;
import com.lululemon.objects.HeaderPom;
import com.lululemon.objects.PlaceOrderPage;
import com.lululemon.objects.SignInPom;

public class PageObjectManager {
	
	
	private CreateAccountPom cap;
	
	private SignInPom sip;
	
	private ForgetPasswordPom fpp;
	
	private HeaderPom hp;
	
	private PlaceOrderPage pop;
	
	public PlaceOrderPage getPop() {
		if(pop==null) {
			pop=new PlaceOrderPage();
		}
		return pop;
	}

	public HeaderPom getHp() {
		if(hp==null) {
			hp=new HeaderPom();
		}
		return hp;
	}
	
	public CreateAccountPom getCap() {
		if(cap==null) {
			cap=new CreateAccountPom();
		}
		return cap;
	}

	public SignInPom getSip() {
		if(sip==null) {
			sip=new SignInPom();
		}
		return sip;
	}

	public ForgetPasswordPom getFpp() {
		if(fpp==null) {
			fpp=new ForgetPasswordPom();
		}
		return fpp;
	}
	
}
