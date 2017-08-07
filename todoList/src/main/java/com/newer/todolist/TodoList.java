package com.newer.todolist;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

/**
 * ���ݴ洢
 * 
 * @author wtao
 *
 */
public class TodoList {

	private static LinkedList<Todo> list = new LinkedList<Todo>();
	static{
		list.add(new Todo(1, "����������", "2017-07-27"));
		list.add(new Todo(2, "��������", "2017-07-25"));
		list.add(new Todo(3, "����ȥˮ����԰", "2017-07-26"));
	}
	//�½�todo
	public static void add(Todo todo){
		 list.add(todo);
	}
	//��ѯ����todo
	public static List<Todo> findAll(){
		return list;
	}
	//����Id��ѯtodo
	public static Todo findById(int id){
		for (Todo todo : list) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	//����todo
	public static void update(Todo todo){
		for(int i = 0;i < list.size(); i++ ){
			if (list.get(i).getId() == todo.getId()) {
				list.get(i).setContent(todo.getContent());
				list.get(i).setTime(todo.getTime());
				break;
			}
		}
	}
	//����idɾ��
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
