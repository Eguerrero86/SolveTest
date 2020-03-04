import React, { Component } from 'react';

class InputComp extends Component{

    state={
        cedula: '',
        urlDocument: ''
    }

    render(){
        return(
            <div className="input-cont expand-container">
                <input className='cedula-input' type="text" placeholder="Cedula"/>
                <div className='import-cont'>
                    <input  className='file-input' type="text" placeholder="Dirección del archivo"/>
                    <button className='select-button'>Seleccionar</button>
                </div>
            </div>
        )
    }
}
export default InputComp;