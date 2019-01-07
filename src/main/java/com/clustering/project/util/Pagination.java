package com.clustering.project.util;

public class Pagination {
	public static final int PAGE_SCALE = 10; // 페이지당 게시물 수
	public static final int BLOCK_SCALE = 5; // 블록당 페이지수

	private int currentPage; // 현재 페이지 번호
	private int previousPage; // 이전 페이지
	private int nextPage; // 다음 페이지
	private int totalPage; // 전체 페이지 갯수
	private int currentBlock; // 현재 페이지 블록 번호
	private int totalBlock; // 전체 페이지 블록 갯수
	private int pageBegin; // 페이지 내에서의 레코드 시작 번호
	private int pageEnd; // 페이지 내에서의 레코드 마지막 번호
	private int blockStart; // 페이지 블록 내에서의 시작 페이지 번호
	private int blockEnd; // 페이지 블록 내에서의 마지막 페이지 번호
	private int totalCount; // 페이지 블록 내에서의 마지막 페이지 번호

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPreviousPage() {
		return previousPage;
	}

	public void setPreviousPage(int previousPage) {
		this.previousPage = previousPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int count) {
		totalPage = (int) Math.ceil(count * 1.0 / PAGE_SCALE);
	}

	public int getCurrentBlock() {
		return currentBlock;
	}

	public void setCurrentBlock(int currentBlock) {
		this.currentBlock = currentBlock;
	}

	public int getTotalBlock() {
		return totalBlock;
	}

	public void setTotalBlock(int totalBlock) {
		this.totalBlock = totalBlock;
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
	public Pagination(int count, int currentPage) {
		this.totalCount = count;
		currentBlock = 1; // 현재 페이지 블록을 1로 설정
		this.currentPage = currentPage; // 현재 페이지 번호 설정
		setTotalPage(count); // 전체 페이저 갯수 설정
		setPageRange(); // 편재 페이지 시작번호, 끝번호 계산
		setTotalBlock(); // 전체 페이지 블록 갯수 계산
		setBlockRange(); // 현재 페이지 블록의 시작 페이지 끝페이지 번호 계산
	}

	// 현재 페이지가 몇번째 페이지에 속하는지 계산
	public void setBlockRange() {
		// 현재 페이지가 몇번째 페이지 블록에 속하는지 계산
		currentBlock = (int) Math.ceil((currentPage - 1) / BLOCK_SCALE) + 1;
		blockStart = (currentBlock - 1) * BLOCK_SCALE + 1; // 시작번호
		blockEnd = blockStart + BLOCK_SCALE - 1; // 끝번호
		if (blockEnd > totalPage) { // 마지막 페이지가 범위를 초과할 경우
			blockEnd = totalPage;
		}

		// 현재 블록이 1이면 이전 페이지를 1로 설정
		previousPage = currentBlock == 1 ? 1 : (currentBlock - 1) * BLOCK_SCALE;

		// 현재 블록이 마지막 블록이면 다음 페이지를 마지막 페이지 번호로 설정
		nextPage = currentBlock > totalBlock ? (currentBlock * BLOCK_SCALE) : (currentBlock * BLOCK_SCALE) + 1;

		// 마지막 페이지가 범위를 넘지 않도록 처리
		if (nextPage >= totalPage) {
			nextPage = totalPage;
		}
	}

	// 전체 페이지 블록 갯수 계산
	public void setTotalBlock() {
		totalBlock = (int) Math.ceil(totalPage / BLOCK_SCALE);
	}

	// 현제페이지의 시작번호, 끝번호 계산
	public void setPageRange() {
		pageBegin = (currentPage - 1) * PAGE_SCALE + 1;
		pageEnd = pageBegin + PAGE_SCALE - 1;
	}
}