import React from 'react';

//library
import { Icon } from '@material-ui/core';

function ResponseComp(){
    return(
        <div className="result-cont expand-container">
            <div className="right-column">
                <div className="toolbar">
                    <div className="title-result">
                        <p>Estos son los resultados de la transacción</p>
                    </div>
                    <div className="download-result">
                        <Icon>star</Icon>
                    </div>
                </div>
                <div className="result-case"></div>
            </div>
            <div className="left-column">
                <div className="user-cont"></div>
            </div>
        </div>
    );
}
export default ResponseComp;