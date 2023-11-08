package co.yedam.reply.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.yedam.common.ChartVO;
import co.yedam.reply.service.ReplyVO;

public interface ReplyMapper {
	
	public List<ReplyVO> selectList(@Param("boardNo") int boardNo, @Param("page") int page);
	public ReplyVO selectReply(int replyNo);
	public int insertReply(ReplyVO vo);
	public int updateReply(ReplyVO vo);
	public int deleteReply(int replyNo);
	
	public int getTotalCnt(int boardNo);
	
	public List<ChartVO> getReplyCntByMember();
}
