package com.clustering.project.util;

public class Pagination {
	public static final int PAGE_SCALE = 10; // 페이지당 게시물 수
	public static final int BLOCK_SCALE = 5; // 블록당 페이지수

	private int curPage; // 현재 페이지 번호
	private int prevPage; // 이전 페이지
	private int nextPage; // 다음 페이지
	private int totPage; // 전체 페이지 갯수
	private int curBlock; // 현재 페이지 블록 번호
	private int totBlock; // 전체 페이지 블록 갯수
	private int pageBegin; // 페이지 내에서의 레코드 시작 번호
	private int pageEnd; // 페이지 내에서의 레코드 마지막 번호
	private int blockStart; // 페이지 블록 내에서의 시작 페이지 번호
	private int blockEnd; // 페이지 블록 내에서의 마지막 페이지 번호
	private int totalCount; // 페이지 블록 내에서의 마지막 페이지 번호

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getTotPage() {
		return totPage;
	}

	public void setTotPage(int count) {
		totPage = (int) Math.ceil(count * 1.0 / PAGE_SCALE);
	}

	public int getCurBlock() {
		return curBlock;
	}

	public void setCurBlock(int curBlock) {
		this.curBlock = curBlock;
	}

	public int getTotBlock() {
		return totBlock;
	}

	public void setTotBlock(int totBlock) {
		this.totBlock = totBlock;
	}

	public int getPageBegin() {
		return pageBegin;
	}

	public void setPageBegin(int pageBegin) {
		this.pageBegin = pageBegin;
	}

	public int getPageEnd() {
		return pageEnd;
	}

	public void setPageEnd(int pageEnd) {
		this.pageEnd = pageEnd;
	}

	public int getBlockStart() {
		return blockStart;
	}

	public void setBlockStart(int blockStart) {
		this.blockStart = blockStart;
	}

	public int getBlockEnd() {
		return blockEnd;
	}

	public void setBlockEnd(int blockEnd) {
		this.blockEnd = blockEnd;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	// 생성자
	public Pagination(int count, int curPage) {
		this.totalCount = count;
		curBlock = 1; // 현재 페이지 블록을 1로 설정
		this.curPage = curPage; // 현재 페이지 번호 설정
		setTotPage(count); // 전체 페이저 갯수 설정
		setPageRange(); // 편재 페이지 시작번호, 끝번호 계산
		setTotBlock(); // 전체 페이지 블록 갯수 계산
		setBlockRange(); // 현재 페이지 블록의 시작 페이지 끝페이지 번호 계산
	}

	// 현재 페이지가 몇번째 페이지에 속하는지 계산
	public void setBlockRange() {
		// 현재 페이지가 몇번째 페이지 블록에 속하는지 계산
		curBlock = (int) Math.ceil((curPage - 1) / BLOCK_SCALE) + 1;
		blockStart = (curBlock - 1) * BLOCK_SCALE + 1; // 시작번호
		blockEnd = blockStart + BLOCK_SCALE - 1; // 끝번호
		if (blockEnd > totPage) { // 마지막 페이지가 범위를 초과할 경우
			blockEnd = totPage;
		}

		// 현재 블록이 1이면 이전 페이지를 1로 설정
		prevPage = curBlock == 1 ? 1 : (curBlock - 1) * BLOCK_SCALE;

		// 현재 블록이 마지막 블록이면 다음 페이지를 마지막 페이지 번호로 설정
		nextPage = curBlock > totBlock ? (curBlock * BLOCK_SCALE) : (curBlock * BLOCK_SCALE) + 1;

		// 마지막 페이지가 범위를 넘지 않도록 처리
		if (nextPage >= totPage) {
			nextPage = totPage;
		}
	}

	// 전체 페이지 블록 갯수 계산
	public void setTotBlock() {
		totBlock = (int) Math.ceil(totPage / BLOCK_SCALE);
	}

	// 현제페이지의 시작번호, 끝번호 계산
	public void setPageRange() {
		pageBegin = (curPage - 1) * PAGE_SCALE + 1;
		pageEnd = pageBegin + PAGE_SCALE - 1;
	}
}