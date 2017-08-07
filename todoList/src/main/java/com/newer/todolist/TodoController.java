package com.newer.todolist;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ������
 * 
 * @author wtao
 *
 */
@Controller
@RequestMapping("/todo")
public class TodoController {
	//��ʾ��������  ת����show.jsp
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String show(Model m){
		System.out.println("show");
		List<Todo> list = TodoList.findAll();
		System.out.println("cahgndu "+list.size());
		m.addAttribute("todos",list);
		return "show";
	}
	//���һ������
	@RequestMapping(value = "/add",method  = RequestMethod.GET)
	public String add(Todo todo){
		System.out.println("add:"+todo.toString());
		TodoList.add(todo);
		return "redirect:/todo/";
	}
	//ɾ��һ������
	@RequestMapping(value = "/{id}/delete",method = RequestMethod.GET)
	public String delete(@PathVariable int id){
		TodoList.delete(id);
		return "redirect:/todo/";
	}
	//�༭����
	@RequestMapping(value = "/{id}/edit",method = RequestMethod.GET)
	public String edit(@PathVariable int id,Model m){
		Todo todo = TodoList.findById(id);
		m.addAttribute("todo",todo);
		return "edit";
	}
	@RequestMapping(value = "/{id}/update",method = RequestMethod.GET)
	public String update(Todo todo){
		TodoList.update(todo);
		return "redirect:/todo/";
	}
}
