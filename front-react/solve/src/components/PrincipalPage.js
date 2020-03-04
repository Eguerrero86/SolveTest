import React, { Component } from 'react';

//StyleSheet
import '../css/PrincipalPage.css';
import '../css/ResponseComp.css';

//Components
import InputComp from './InputComp';
import ResponseComp from './ResponseComp';

class PrincipalPage extends Component{
    render(){
        return(
            <div className='general-container expand-container'>
                <div className='input-container'>
                    <InputComp/>
                </div>
                <div className='output-container'>
                    <ResponseComp/>
                </div>
            </div>

        )
    }
}
export default PrincipalPage;