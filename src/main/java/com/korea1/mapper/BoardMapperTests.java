package com.korea1.mapper;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.korea1.domain.BoardVO;
import com.korea1.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j 
@Component
public class BoardMapperTests {


	@Autowired
	BoardMapper mapper;
	
	@Autowired
	Criteria criteria;
	
	
	
	@Test
	public void getListTest() {
		List<BoardVO>list = mapper.getList();
		list.forEach(vo -> vo.toString());
	}
		
	@Test 
	public void insertTest() {	 
		mapper.insert(new BoardVO(1,"제목1","내용1","작성자1"));
		mapper.insert(new BoardVO(2,"제목2","내용2","작성자2"));
	}
	@Test
	public void readTest() {
		log.info("ReadTest:"+mapper.read((long)1));
	}
	@Test
	public void DeleteTest() {
		log.info("DeleteTest:"+mapper.delete((long)1));
	}
	@Test
	public void UpdateTest() {
		mapper.update(new BoardVO(2,"제목3","내용3","작성자3"));
	}
	@Test
	public void getTotalCountTest() {
		log.info("getTotalCount : " +criteria.getTotalCountTest(200));
}

}




