import React from "react";
import Comment from "./Comment";

const comments = [
    {
        name: "이인제",
        comment: "안녕하세요, 소플입니다."
    },
    {
        name: "홍길동",
        comment: "안녕하세요, 홍길동입니다."
    },
    {
        name: "김덕배",
        comment: "안녕하세요, 김덕배입니다."
    }
];
function CommentList(props) {
    return(
        <div>
            {comments.map((comment)=>{
                return (
                    <Comment name={comment.name} comment={comment.comment}/>
                );
            })}
        </div>
    );
}
export default CommentList;