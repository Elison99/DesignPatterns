package org.example.design.behavioral.state;

/**
 * 环境类：
 */
public class SKTTeam {

    //状态类
    private TeamState teamState;

    public void setTeamState(TeamState teamState) {
        this.teamState = teamState;
    }

    //开始游戏
    public void startGame(){
        //状态不同会导致不同的游戏结果
        teamState.play();
    }

    //下一个状态
    void nextState(){
        teamState = teamState.next();
    }
}
