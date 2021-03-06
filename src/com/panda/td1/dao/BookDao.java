package com.panda.td1.dao;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.panda.td1.entity.Book;

public interface BookDao extends Serializable {
    /**
     * 返回相应的数据集合
     *
     * @param map
     * @return
     */
    public List<Book> findBooks(Map<String, Object> map);

    /**
     * 数据数目
     *
     * @param map
     * @return
     */
    public Long getTotalBooks(Map<String, Object> map);

    /**
     * 添加书籍
     *
     * @param book
     * @return
     */
    public int insertBook(Book book);

    /**
     * 修改书籍信息
     *
     * @param book
     * @return
     */
    public int updBook(Book book);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    public int delBook(String id);

    /**
     * 根据id查找
     *
     * @param id
     * @return
     */
    public Book getBookById(String id);

    /**
     * 根据ISBN查找
     *
     * @return
     */
    public Book getBookByISBN(String isbn);

    /**
     * 返回相应的数据集合,前端方法
     *
     * @param map
     * @return
     */
    public List<Book> searchBooks(Map<String, Object> map);

    /**
     * 数据数目
     *
     * @param map
     * @return
     */
    public Long getSearchBooks(Map<String, Object> map);

    /**
     * 查找分类书籍,前端方法
     *
     * @param map
     * @return
     */
    public List<Book> getCategoryBooks(Map<String, Object> map);

    /**
     * 数据数目
     *
     * @param map
     * @return
     */
    public Long getTotalCategoryBooks(Map<String, Object> map);


}