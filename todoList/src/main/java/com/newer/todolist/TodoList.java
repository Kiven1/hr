package com.newer.todolist;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

/**
 * 数据存储
 * 
 * @author wtao
 *
 */
public class TodoList {

	private static LinkedList<Todo> list = new LinkedList<Todo>();
	static{
		list.add(new Todo(1, "今天星期三", "2017-07-27"));
		list.add(new Todo(2, "天气好热", "2017-07-25"));
		list.add(new Todo(3, "今天去水上乐园", "2017-07-26"));
	}
	//新建todo
	public static void add(Todo todo){
		 list.add(todo);
	}
	//查询所有todo
	public static List<Todo> findAll(){
		return list;
	}
	//根据Id查询todo
	public static Todo findById(int id){
		for (Todo todo : list) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	//更新todo
	public static void update(Todo todo){
		for(int i = 0;i < list.size(); i++ ){
			if (list.get(i).getId() == todo.getId()) {
				list.get(i).setContent(todo.getContent());
				list.get(i).setTime(todo.getTime());
				break;
			}
		}
	}
	//根据id删除
	public static boolean delete(int id){
		boolean isDelete = false;
		for(int i = 0;i < list.size(); i++){
			if (list.get(i).getId() == id) {
				list.remove(i);
				isDelete = true;
				break;
			}
		}
		return isDelete;
	}
}
