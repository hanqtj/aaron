package com.aaron.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaron.model.ThreeD;
import com.aaron.service.AaronService;
import com.aaron.utils.ExcelReadHelper;

@Controller
@RequestMapping("/aaron")
public class AaronController {
	@Autowired
	private AaronService aaronService;
	@RequestMapping("/importExcel")
	@ResponseBody
	public Object getData() throws Exception{
		File file = new File("D://x3d.xls");
		String[] properties={"numberDate","numberBai","numberShi","numberGe"};
		List<Object> list = ExcelReadHelper.excelRead(file, properties, ThreeD.class);
		List<ThreeD> threeDList = new ArrayList<>();
		for (Object object : list) {
			ThreeD td = new ThreeD();
			td = (ThreeD) object;
			threeDList.add(td);
		}
		aaronService.batchInsertData(threeDList);
		
		return "导入成功！";
	}
}
