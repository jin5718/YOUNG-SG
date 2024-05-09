// 회의 참여자
export type Participant = {
  nickName: string;
  profile: string;
};

// 회의 상세페이지에서 보여줄 데이터들
export type MeetingDetailData = {
  detailId: number;
  summary: string;
  participantInfoDtoList: Participant[];
  fileUrl: string;
  preMeetingId: number | null;
  nextMeetingId: number | null;
  date: string;
  title: string; // 회의명
  name: string; // 파일명
};

/* 이전, 현재, 다음 회의 */
// 박스
export type MeetingNavigationBoxProps = {
  prev: number | null;
  cur: string;
  next: number | null;
  date: string;
  title: string;
};

// 이전/현재/다음 회의 제목, 날짜
export type MeetingNavigationInfoProps = {
  move: [number | null, string][]; // prev or next
  cur: string;
  date: string;
  title: string;
};

// 이전 다음 이동 버튼
export type ArrowButtonProps = {
  prev: number | null;
  next: number | null;
};

/* 댓글 */
export type CommentType = {
  commentId: number;
  content: string;
  createAt: string;
  memberId: number;
  nickname: string;
  profileUrl: string;
};
