package com.study.SpringBootApplication.VarObject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class TopPage {
	String[] names = { "tuyano", "hanako", "taro", "sachiko", "ichiro" };

	String[] mails = { "syoda@tuuyano.com", "hanako@flower", "taro@yamada", "sachiko@happy", "ichiro@baseball"

	};

	@RequestMapping(value = "/top")
	public ModelAndView top(ModelAndView mav3) {
		mav3.setViewName("top");
		mav3.addObject("msg", "current data.");
		DataObject obj = new DataObject(123, "hanako", "hanako@flower");
		mav3.addObject("object", obj);
		return mav3;
	}

	class DataObject {
		private int id;
		private String name;
		private String value;

		public DataObject(int id, String name, String value) {
			// TODO Auto-generated constructor stub
			super();
			this.id = id;
			this.name = name;
			this.value = value;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}
}
