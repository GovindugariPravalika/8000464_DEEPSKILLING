import { useParams } from "react-router-dom";
import trainersMock from "./TrainersMock";

function TrainerDetails() {

    const { id } = useParams();

    const trainer = trainersMock.find(
        (item) => item.trainerId === id
    );

    if (!trainer) {
        return <h2>Trainer Not Found</h2>;
    }

    return (

        <div>

            <h2>
                {trainer.name} ({trainer.technology})
            </h2>

            <p>{trainer.email}</p>

            <p>{trainer.phone}</p>

            <h3>Skills</h3>

            <ul>

                {trainer.skills.map((skill, index) => (

                    <li key={index}>{skill}</li>

                ))}

            </ul>

        </div>

    );

}

export default TrainerDetails;