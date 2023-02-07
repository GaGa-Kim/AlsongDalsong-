import React, { useEffect } from "react";
import { useNavigate } from "react-router-dom";
import MNButton from "../ui/menuBT";
import Template from "../ui/template";
import Userimg from "../ui/Userimg";
import Drop from "../ui/Drop";
import BTemplate from "../ui/BackgroundBox";
import SButton from "../ui/SelectButton";
import './writepage.css';


function Writepage(props) {

    const navigate = useNavigate();
    return (
        <Template>
            <Drop/>
            <Userimg
                onClick={() => {
                navigate("/new");
            }}/>
            <BTemplate>
                <span className="flex-container">
                    <div Class="Btn">
                        <input type="Radio" name="category" id="buy" />
                        <label For="buy">살까 말까</label>
                    </div>
                    <div Class="Btn">
                        <input type="Radio" name="category" id="act" />
                        <label For="act">할까 말까</label>
                    </div>
                    <div Class="Btn">
                        <input type="Radio" name="category" id="go" />
                        <label For="go">갈까 말까</label>
                    </div>
                </span>
            
                <span className="flex-container">
                    
                    <div><input type='button' 
                        value='카테고리' class="cabtn"/></div>
                    <div Class="Btn2">
                            <input Type="Radio" Name="category" Id="fashion" checked />
                            <label For="fashion">패션</label>
                    </div>
                    <div Class="Btn2">
                        <input Type="Radio" Name="category" Id="appliance" />
                        <label For="appliance">가전</label>
                    </div>
                    <div Class="Btn2">
                        <input Type="Radio" Name="category" Id="beauty" />
                        <label For="beauty">뷰티</label>
                    </div>
                    <div Class="Btn2">
                        <input Type="Radio" Name="category" Id="grocery" />
                        <label For="grocery">식품</label>
                    </div>
                    </span>

            <span className="flex-container">
            
                <div><input type='button' 
                    value='누가' class="cabtn"/></div>
                        <div Class="Btn2">
                        <input Type="Radio" Name="person" Id="male" checked />
                        <label For="male">남성</label>
                </div>
                <div Class="Btn2">
                    <input Type="Radio" Name="person" Id="female" />
                    <label For="female">여성</label>
                </div>
            </span>
            
            <span className="flex-container">&nbsp;&nbsp;&nbsp;&nbsp;
                <div Class="Btn2">
                    <input Type="Radio" Name="generation" Id="10" checked />
                    <label For="10">10대</label>
                </div>
                <div Class="Btn2">
                    <input Type="Radio" Name="generation" Id="20" />
                    <label For="20">20대</label>
                </div>
                <div Class="Btn2">
                    <input Type="Radio" Name="generation" Id="30" />
                    <label For="30">30대</label>
                </div>
                <div Class="Btn2">
                    <input Type="Radio" Name="generation" Id="40" />
                    <label For="40">40대</label>
                </div>
            </span>

            <span className="flex-container">
            <div><MNButton title="언제" /></div><div><input type='date' id='currentDate' class="choice"/></div></span>

            <span className="flex-container">
            <div><MNButton title="무엇을" /></div><div><textarea cols="15" rows="2" placeholder="직접입력"></textarea></div></span>

            <span className="flex-container">
            <div><MNButton title="내용" /></div><div><textarea cols="30" rows="8" class="rad"></textarea></div></span>

            <span className="flex-container">
            <div><MNButton title="링크" /></div><div><textarea cols="15" rows="2" placeholder="직접입력"></textarea></div></span>

            <span className="flex-container">
            <div><MNButton title="중요도" /></div>
                <form name="myform" id="myform" method="post" action="./save">
                    <fieldset>
                        <label for="rate1">⭐</label><input type="radio" name="rating" value="5" id="rate1" />
                        <label for="rate2">⭐</label><input type="radio" name="rating" value="4" id="rate2" />
                        <label for="rate3">⭐</label><input type="radio" name="rating" value="3" id="rate3" />
                        <label for="rate4">⭐</label><input type="radio" name="rating" value="2" id="rate4" />
                        <label for="rate5">⭐</label><input type="radio" name="rating" value="1" id="rate5" />
                    </fieldset>
                </form>
            </span>

            <span className="flex-container">
                <div><MNButton title="사진" /></div>
                <form>
                    <input type = "file" name = "fileupload" accept = "image/*" class="filechoose"/>
                </form>
            </span>
            
            <span className="flex-container">
                <div>
                    <SButton 
                        title="등록하기" 
                        onClick={() => {
                            navigate("/main-page");
                        }}
                    />
                </div>
            </span>
            </BTemplate>
        </Template>
    );
}

export default Writepage;
